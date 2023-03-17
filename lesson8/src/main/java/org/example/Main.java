package org.example;

import org.example.model.Specialist;
import org.example.model.Speciality;
import org.example.util.StreamAPIUtil;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Specialist> specialists = StreamAPIUtil.getSpecialists();

        // filter
        List<Specialist> engineers = StreamAPIUtil.filterBySpecialty(specialists, Speciality.ENGINEER);
        StreamAPIUtil.printSpecialists(engineers);
        System.out.println("=============");

        // sorting
        List<Specialist> sortedSpecialistsAsc = StreamAPIUtil.sortSpecialistsByNameAsc(specialists);
        List<Specialist> sortedSpecialistsDesc = StreamAPIUtil.sortSpecialistsByNameDesc(specialists);
        StreamAPIUtil.printSpecialists(sortedSpecialistsAsc);
        StreamAPIUtil.printSpecialists(sortedSpecialistsDesc);
        System.out.println("=============");

        // max salary
        Specialist withMaxSalary = StreamAPIUtil.findWithMaxSalary(specialists);
        System.out.println(withMaxSalary);
        System.out.println("=============");

        // min salary
        Specialist withMinSalary = StreamAPIUtil.findWithMinSalary(specialists);
        System.out.println(withMinSalary);
        System.out.println("=============");

        // grouping
        Map<Speciality, List<Specialist>> groupedBySpeciality = StreamAPIUtil.groupBySpeciality(specialists);
        System.out.println(groupedBySpeciality);
        System.out.println("==============");

        // all engineers
        boolean allEngineers = StreamAPIUtil.matchAllEngineers(specialists);
        System.out.println(allEngineers);
        System.out.println("================");

        // any engineers
        boolean anyEngineer = StreamAPIUtil.matchAnyEngineer(specialists);
        System.out.println(anyEngineer);
        System.out.println("================");

        // all salary more as 1000
        boolean allSalaryMoreThen1000 = StreamAPIUtil.matchAllSalaryMoreThen(specialists, new BigDecimal(1000));
        System.out.println(allSalaryMoreThen1000);
        System.out.println("================");

        // no one with salary more as 10000
        boolean noOneWithSalaryMoreThen10000 = StreamAPIUtil.matchNoneSalaryMoreThen(specialists, new BigDecimal(10000));
        System.out.println(noOneWithSalaryMoreThen10000);














    }
}
