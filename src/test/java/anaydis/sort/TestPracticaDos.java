package anaydis.sort;

import anaydis.sort.data.DataSetGenerator;
import anaydis.sort.data.StringDataSetGenerator;
import anaydis.sort.provider.SorterProvider;
import anaydis.sort.test.AbstractTestPracticaDos;

public class TestPracticaDos extends AbstractTestPracticaDos {

    @Override protected DataSetGenerator<String> getStringDataSetGenerator() {
        return new StringDataSetGenerator();
    }

    @Override protected DataSetGenerator<Integer> getIntegerDataSetGenerator() {
        return new IntDataSetGenerator();
    }

    @Override protected SorterProvider getSorterProvider() {
        return new SortProvider();
    }
}
