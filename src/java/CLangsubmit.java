import java.io.*;
import javax.servlet.*;

public class CLangsubmit extends GenericServlet {
    public void service(ServletRequest rq, ServletResponse rs) 
    {
        try {
            int c = 0;
            rs.setContentType("text/html");
            PrintWriter out = rs.getWriter();
            String sname = rq.getParameter("participant_name");
            String fname = rq.getParameter("participant_father's name");
            String s_email = rq.getParameter("participant_e-mail id");

            if (rq.getParameter("q1") != null && rq.getParameter("q1").equals("Dennis Ritchie")) {
                c++;
            }
            if (rq.getParameter("q2") != null && rq.getParameter("q2").equals("int main()")) {
                c++;
            }
            if (rq.getParameter("q3") != null && rq.getParameter("q3").equals("LowerCase letters")) {
                c++;
            }
            if (rq.getParameter("q4") != null && rq.getParameter("q4").equals("Variable names cannot start with a digit")) {
                c++;
            }
            if (rq.getParameter("q5") != null && rq.getParameter("q5").equals("int my_num = 100000;")) {
                c++;
            }

            out.println("<html><body>");
            out.println("<h2>Quiz Results:</h2>");
            out.println("Student name = " + sname + "<br>");
            out.println("Student 's father's name = " + fname + "<br>");
            out.println("Student E-mail address = " + s_email + "<br>");
            out.println("Total marks = " + c + "<br>");
            out.println("Correct answers = " + c + "<br>");
            out.println("Incorrect answers = " + (5 - c) + "<br>");
            out.println("</body></html>");

        } 
        catch (Exception e) 
        {
           
        }
    }
}
