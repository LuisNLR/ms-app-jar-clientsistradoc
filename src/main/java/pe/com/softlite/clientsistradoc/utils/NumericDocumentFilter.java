/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author USER
 */
public class NumericDocumentFilter extends DocumentFilter {

    private final int maxLength;

    public NumericDocumentFilter(int maxLength) {
        this.maxLength = maxLength;
    }

    private boolean isNumeric(String text) {
        return text.matches("\\d*"); // solo dígitos
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string == null) {
            return;
        }

        Document doc = fb.getDocument();
        String newText = new StringBuilder(doc.getText(0, doc.getLength()))
                .insert(offset, string)
                .toString();

        if (isNumeric(string) && newText.length() <= maxLength) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text == null) {
            return;
        }

        Document doc = fb.getDocument();
        String newText = new StringBuilder(doc.getText(0, doc.getLength()))
                .replace(offset, offset + length, text)
                .toString();

        if (isNumeric(text) && newText.length() <= maxLength) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        super.remove(fb, offset, length);
    }

}
