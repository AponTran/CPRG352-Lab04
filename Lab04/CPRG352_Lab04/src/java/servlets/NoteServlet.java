
package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author AponTran
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        // read note text
        BufferedReader text = new BufferedReader(new FileReader(new File(path)));
        
        String title = text.readLine();
        String content = text.readLine();
        text.close();
        
        Note note = new Note(title, content);
        request.setAttribute("note", note);
        String edit = request.getParameter("edit");
        
        //edit parameter's value
        if (edit == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        }
        else if (edit == "") {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String editTitle = request.getParameter("edit_title");
        String editContent = request.getParameter("edit_contents");

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        pw.println(editTitle);
        pw.println(editContent);
        pw.close();
        
        Note note_2 = new Note(editTitle, editContent);
        request.setAttribute("note", note_2);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
    }
}
