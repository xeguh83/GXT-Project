package com.sencha.gxt.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.ui.*;


public class project implements EntryPoint {

    /**
     * A composite of a TextBox and a CheckBox that optionally enables it.
     */
    @Override
    public void onModuleLoad() {
        // Create an optional text box and add it to the root panel.
        OptionalTextBox otb = new OptionalTextBox(
                "Want to explain the solution?");
        otb.setEnabled(true);
        RootPanel.get().add(otb);
    }


    private static class OptionalTextBox extends Composite implements
            ClickHandler {

        private TextBox textBox = new TextBox();
        private CheckBox checkBox = new CheckBox();
        private boolean enabled = true;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public OptionalTextBox(String caption) {
            // place the check to the right of the text box using a horizontal panel.
            HorizontalPanel panel = new HorizontalPanel();
            panel.add(checkBox);
            panel.add(textBox);
            // all composites must call initWidget() in their constructors.
            panel.addStyleName("orangeOutline");
//          set style name for entire widget
//          setStyleName("optionalTextWidget");
            initWidget(panel);

            //set style name for text box

            textBox.setStyleName("optionalTextBox");


            //set style name for check box
            checkBox.setStyleName("optionalCheckBox");


            // Set the check box's caption, and check it by default.
            checkBox.setText(caption);
            checkBox.setValue(enabled);
            checkBox.addClickHandler(this);
            enableTextBox(enabled, checkBox.getValue());

        }

        @Override
        public void onClick(ClickEvent event) {
            if (event.getSource() == checkBox) {
                // When the check box is clicked,
                //update the text box's enabled state.
                enableTextBox(enabled, checkBox.getValue());
            }
        }

        private void enableTextBox(boolean enable, boolean isChecked) {
            enable = (enable && isChecked) || (!enable && !isChecked);
            textBox.setStyleDependentName("disabled", !enable);
            textBox.setEnabled(enable);
        }

    }

}
