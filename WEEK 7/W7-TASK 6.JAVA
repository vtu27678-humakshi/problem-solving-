public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> result = new ArrayList<>();

    for (int grade : grades) {
        if (grade >= 38) {
            int remainder = grade % 5;

            if (remainder >= 3) {
                grade += (5 - remainder);
            }
        }

        result.add(grade);
    }

    return result;
}

INPUT
4
73
67
38
33

OUTPUT
75
67
40
33
