package TreinoWriter;

import TreinoWriter.Gson.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrincipalGson {
    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        Titulo t1 = new Titulo("Enzo", 20, "Muito Lindo");
        Titulo t2 = new Titulo("Victor", 21, "Muito Fofo");
        Titulo t3 = new Titulo("Roger", 19, "Muito Gordo");
        Titulo t4 = new Titulo("Daniela", 18, "Muito Linda");

        List<Titulo> titulos = new ArrayList<>();
        titulos.add(t1);
        titulos.add(t2);
        titulos.add(t3);
        titulos.add(t4);

        FileWriter fw = new FileWriter("titulosComNome.json");
        fw.write(gson.toJson(titulos));
        fw.close();
    }


}
