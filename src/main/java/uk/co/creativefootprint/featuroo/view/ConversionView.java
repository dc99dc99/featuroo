package uk.co.creativefootprint.featuroo.view;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionView {

    String value;
    String goal;

    public ConversionView(String value, String goal) {

        this.value = value;
        this.goal = goal;
    }

    public String getValue() {
        return value;
    }

    public String getGoal() {
        return goal;
    }
}
