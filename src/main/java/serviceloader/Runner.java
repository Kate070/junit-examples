package serviceloader;

import examples.QA;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        QA qa = null;
//        qa = new QA();

        ServiceLoader<QA> loader = ServiceLoader.load(QA.class);
        List<ServiceLoader.Provider<QA>> qaList = loader.stream().collect(Collectors.toList());

        qaList.forEach(e -> System.out.println(e.get().introduceYourSelf()));
    }
}
