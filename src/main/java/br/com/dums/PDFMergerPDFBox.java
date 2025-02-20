package br.com.dums;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import java.io.IOException;
import java.util.Arrays;

public class PDFMergerPDFBox {
    public static void main(String[] args) throws IOException {
        if (args.length < 3) {
            System.out.println("Usage: java PDFMergerPDFBox <output.pdf> <input1.pdf> <input2.pdf> ...");
            return;
        }

        String outputFile = args[0]; // First argument is the output file
        String[] inputFiles = Arrays.copyOfRange(args, 1, args.length); // Remaining arguments are input PDFs

        try {
            mergePDFs(inputFiles, outputFile);
            System.out.println("Merged PDF saved as: " + outputFile);
        } catch (IOException e) {
            System.err.println("Error merging PDFs: " + e.getMessage());
        }
    }

    public static void mergePDFs(String[] inputFiles, String outputFile) throws IOException {
        PDFMergerUtility merger = new PDFMergerUtility();
        for (String file : inputFiles) {
            merger.addSource(file);
        }
        merger.setDestinationFileName(outputFile);
        merger.mergeDocuments(null);
    }

}