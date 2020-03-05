package controllor;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.ir.RuntimeNode.Request;
import java.util.List;
import model.Projekti;
import model.Zaposleni;
import service.SviZaposleniServis;
/**
 * Servlet implementation class ListaProjekata
 */
@WebServlet("/ListaProjekata")
public class ListaProjekata extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String ListaProjekata = null;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SviZaposleniServis service = new SviZaposleniServis();

		List<Zaposleni> SviZaposleni = service.vratiSveZaposlene();
		request.setAttribute("SviZaposleni", SviZaposleni);
		
		if(ListaProjekata != null && !ListaProjekata.isEmpty()) {
			//saljem na ListaProjekata
			RequestDispatcher dispatcher = request.getRequestDispatcher("view/ListaProjekata.jsp");
			dispatcher.forward(request, response);
		}else {
			response.sendRedirect("view/adminPage.jsp");
		}	
	}
}
