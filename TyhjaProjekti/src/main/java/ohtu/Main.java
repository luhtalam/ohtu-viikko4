package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // vaihda oma opiskelijanumerosi seuraavaan
        String studentNr = "012345678";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";
        String url2 = "https://ohtustats2017.herokuapp.com/courses/1.json";

        String bodyText = Request.Get(url).execute().returnContent().asString();
        String bodyText2 = Request.Get(url2).execute().returnContent().asString();

        System.out.println("json-muotoinen data:");
        System.out.println( bodyText );
        System.out.println(bodyText2);
        System.out.println("");

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
        Course course = mapper.fromJson(bodyText2, Course.class);
        
        System.out.println("Kurssi: " + course);
        System.out.println("\nOpiskelijanumero: " + subs[0].getStudent_number()+ "\n");
        int hours = 0;
        int e = 0;
        int w;
        int[] max = course.getWeeks();
        for (Submission submission : subs) {
            w = submission.getWeek();
            System.out.println("\tviikon " + w + " tehtävien maksimimäärä: " + max[w-1]+",");
            System.out.println("\t\t"+submission+"\n");
            hours += submission.getHours();
            e+= submission.getENumb();
        }
        System.out.println("\nyhteensä: " + e + " tehtävää " + hours + " tuntia");

    }
}
