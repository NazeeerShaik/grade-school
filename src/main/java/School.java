import java.util.*;

class School {
    private Map<Integer, List<String>> school;

    School() {
        school = new TreeMap<>();
    }

    public void add(String name, int grade) {
        if (school.containsKey(grade)) {
            school.get(grade).add(name);
        } else school.put(grade, new ArrayList<>(List.of(name)));
    }

    public List<String> roster() {
        List<String> students = new ArrayList<>();
        for (Map.Entry<Integer, List<String>> school : school.entrySet()) {
            List<String> studentsWithSameGrade = school.getValue();
            Collections.sort(studentsWithSameGrade);
            students.addAll(studentsWithSameGrade);
        }
        return students;
    }

    public List<String> grade(int value) {
        if (school.containsKey(value)) {
            List<String> students = school.get(value);
            Collections.sort(students);
            return students;
        } else return Collections.emptyList();
    }

}


