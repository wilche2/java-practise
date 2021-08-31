package com.example.demowt.strategy.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author caowq
 * @date 2021-08-31 17:12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Travel {

    private String name;
    private String value;
    private List<String> tourist;

}
