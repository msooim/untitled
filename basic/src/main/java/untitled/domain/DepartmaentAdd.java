package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class DepartmaentAdd extends AbstractEvent {

    private Long id;
    private String name;

    public DepartmaentAdd(Department aggregate) {
        super(aggregate);
    }

    public DepartmaentAdd() {
        super();
    }
}
