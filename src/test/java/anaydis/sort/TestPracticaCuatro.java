package anaydis.sort;

import anaydis.sort.data.DataSetGenerator;
import anaydis.sort.data.StringDataSetGenerator;
import anaydis.sort.provider.SorterProvider;
import anaydis.sort.test.AbstractTestPracticaCuatro;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: AnayDis-2013
 * Date: 05/09/13
 * Time: 19:53
 */
public class TestPracticaCuatro extends AbstractTestPracticaCuatro {

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
