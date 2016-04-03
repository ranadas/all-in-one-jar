package com.rdas.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by rdas on 03/04/2016.
 * No boilerplate code.
 */
@lombok.Getter
@lombok.Setter
@lombok.RequiredArgsConstructor
@lombok.EqualsAndHashCode(of = {"number", "text"})
@lombok.ToString(exclude = "strList")
public class ModelBean {
    private boolean flag;
    private final int number;
    private final String text;
    private List<String> strList;

    public List<String> getStrList() {
        if (strList == null) {
            strList = new ArrayList<>(128);
        }
        return Collections.unmodifiableList(strList);
    }
}
