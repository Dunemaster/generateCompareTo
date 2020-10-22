package com.equocredite.GenerateCompareTo.ui;

import javax.swing.*;
import java.awt.*;

public class NullableColumnInfoCellRendererEditor extends ToggleCellRendererEditor {
    private final JPanel emptyPanel = new JPanel();

    public NullableColumnInfoCellRendererEditor() {
        super(new JCheckBox[]{new JCheckBox()});
        buttons[0].setSelected(true);
    }

    @Override
    protected Component getPanel(Object value) {
        if (value == null) {
            buttons[0].setSelected(Boolean.FALSE);
            return emptyPanel;
        }
        if (!getCellEditorValue().equals(value)) {
            buttons[0].setSelected(Boolean.TRUE.equals(value));
        }
        return buttonPanel;
    }
}
