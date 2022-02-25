/** 
 * javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
 * java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest
 */

import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testFile() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        assertEquals(expected,links);
    }

    @Test
    public void testFile2() throws IOException{
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected,links);
    }

    @Test
    public void testFile3() throws IOException{
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected,links);
    }

    @Test
    public void testFile4() throws IOException{
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected,links);
    }

    @Test
    public void testFile5() throws IOException{
        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected,links);
    }

    @Test
    public void testFile6() throws IOException{
        Path fileName = Path.of("test-file6.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("page1.com");
        assertEquals(expected,links);
    }

    @Test
    public void testFile7() throws IOException{
        Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected,links);
    }

    @Test
    public void testFile8() throws IOException{
        Path fileName = Path.of("test-file8.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected,links);
    }


    //Lab report 4 - week 8
    @Test
    public void labTestOne() throws IOException {
        Path fileName = Path.of("lab-test-file1.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        List<String> correctOutput = List.of("`google.com");

        assertEquals(correctOutput, links);
    }

    @Test
    public void labTestTwo() throws IOException {
        Path fileName = Path.of("lab-test-file1.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        List<String> correctOutput = List.of("a.com", "a.com(())",
            "example.com");

        assertEquals(correctOutput, links);
    }

    @Test
    public void labTestThree() throws IOException {
        Path fileName = Path.of("lab-test-file2.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);

        List<String> correctOutput = List.of("https://ucsd-cse15l-w22.github.io/");

        assertEquals(correctOutput, links);
    }
}