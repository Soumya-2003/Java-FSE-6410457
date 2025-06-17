public class TestDocumentFactory{
    public static void main(String[] args) {
        DocumentFactory wordfactory = new WordDocumentFactory();
        DocumentFactory pdffactory = new PdfDocumentFactory();
        DocumentFactory excelfactory = new ExcelDocumentFactory();

        Document wordDoc = wordfactory.createDocument();
        Document pdfDoc = pdffactory.createDocument();
        Document excelDoc = excelfactory.createDocument();

        wordDoc.openDoc();
        wordDoc.saveDoc();  

        pdfDoc.openDoc();
        pdfDoc.saveDoc();               
        
        excelDoc.openDoc();
        excelDoc.saveDoc();

    }
}