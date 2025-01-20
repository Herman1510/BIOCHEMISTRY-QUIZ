import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class QuizServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve user's answers from the form submission
        String[] answers = {
            request.getParameter("q1"),
            request.getParameter("q2"),
            request.getParameter("q3"),
            request.getParameter("q4"),
            request.getParameter("q5"),
            request.getParameter("q6"),
            request.getParameter("q7"),
            request.getParameter("q8"),
            request.getParameter("q9"),
            request.getParameter("q10"),
            request.getParameter("q11"),
            request.getParameter("q12"),
            request.getParameter("q13"),
            request.getParameter("q14"),
            request.getParameter("q15"),
            request.getParameter("q16"),
            request.getParameter("q17"),
            request.getParameter("q18"),
            request.getParameter("q19"),
            request.getParameter("q20"),
            request.getParameter("q21"),
            request.getParameter("q22"),
            request.getParameter("q23"),
            request.getParameter("q24"),
            request.getParameter("q25"),
            request.getParameter("q26"),
            request.getParameter("q27"),
            request.getParameter("q28"),
            request.getParameter("q29"),
            request.getParameter("q30"),
            request.getParameter("q31"),
            request.getParameter("q32"),
            request.getParameter("q33"),
            request.getParameter("q34"),
            request.getParameter("q35"),
            request.getParameter("q36"),
            request.getParameter("q37"),
            request.getParameter("q38"),
            request.getParameter("q39"),
            request.getParameter("q40"),
            request.getParameter("q41"),
            request.getParameter("q42"),
            request.getParameter("q43"),
            request.getParameter("q44"),
            request.getParameter("q45"),
            request.getParameter("q46"),
            request.getParameter("q47"),
            request.getParameter("q48"),
            request.getParameter("q49"),
            request.getParameter("q50"),
            request.getParameter("q51"),
            request.getParameter("q52"),
            request.getParameter("q53"),
            request.getParameter("q54"),
            request.getParameter("q55"),
            request.getParameter("q56"),
            request.getParameter("q57"),
            request.getParameter("q58"),
            request.getParameter("q59"),
            request.getParameter("q60")
        };

        // Correct answers
        String[] correctAnswers = {
            "d", "b", "a", "b", "d", "d", "d", "d", "b", "d",
            "b", "c", "b", "a", "a", "a", "c", "a", "c", "a",
            "a", "b", "b", "d", "b", "a", "b", "c", "d", "d",
            "b", "b", "b", "c", "a", "a", "c", "b", "d", "d",
            "a", "b", "b", "b", "d", "b", "a", "a", "d", "b"
        };

        // Count correct answers
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] != null && answers[i].equals(correctAnswers[i])) {
                score++;
            }
        }

        // Send feedback to the user
        out.println("<html><body>");
        out.println("<h1>Your Score: " + score + " out of 60</h1>");

        if (score == 60) {
            out.println("<h2>Perfect! You answered all questions correctly.</h2>");
        } else if (score >= 45) {
            out.println("<h2>Great job! You're very close to a perfect score.</h2>");
        } else if (score >= 30) {
            out.println("<h2>Good effort! Keep studying to improve your score.</h2>");
        } else {
            out.println("<h2>Don't worry, keep trying and you'll improve.</h2>");
        }

        out.println("</body></html>");
    }
}
