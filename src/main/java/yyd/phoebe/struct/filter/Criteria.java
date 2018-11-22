package yyd.phoebe.struct.filter;

import java.util.List;

public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);
}
