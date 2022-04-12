package com.ifuwanna.template;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import org.junit.jupiter.api.Test;
import org.springframework.vault.support.JsonMapFlattener;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * packageName    : com.ifuwanna.template
 * fileName       : TemplateTest
 * author         : Jihun Park
 * date           : 2022/03/18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/18        Jihun Park       최초 생성
 */
class TemplateTest {

    @Test
    public void test() throws Exception{


        ArrayList<Item> itemList = new ArrayList<>(items());
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile("template/template");
        mustache.execute(new PrintWriter(System.out), new TemplateTest()).flush();

        /*

        HashMap<String, Object> scopes = new HashMap<String, Object>();
        scopes.put("name", "Mustache");
        scopes.put("feature", new Feature("Perfect!"));

        Writer writer = new OutputStreamWriter(System.out);
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile(new StringReader("{{name}}, {{feature.description}}!"), "example");
        mustache.execute(writer, scopes);
        writer.flush();*/
    }


    public List<Item> items() {
        return Arrays.asList(
                new Item("Item 1", "$19.99", Arrays.asList(new Feature("New!"), new Feature("Awesome!"))),
                new Item("Item 2", "$29.99", Arrays.asList(new Feature("Old."), new Feature("Ugly.")))
        );
    }


    static class Item {
        Item(String name, String price, List<Feature> features) {
            this.name = name;
            this.price = price;
            this.features = features;
        }
        String name, price;
        List<Feature> features;
    }


    static class Feature {
        String description;
        Feature(String description) {
            this.description = description;
        }
/*        String description() throws InterruptedException {
            Thread.sleep(1000);
            return description;
        }*/
    }
}