class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, List<String>> map = Map.of(
                '2', Arrays.asList("a", "b", "c"),
                '3', Arrays.asList("d", "e", "f"),
                '4', Arrays.asList("g", "h", "i"),
                '5', Arrays.asList("j", "k", "l"),
                '6', Arrays.asList("m", "n", "o"),
                '7', Arrays.asList("p", "q", "r", "s"),
                '8', Arrays.asList("t", "u", "v"),
                '9', Arrays.asList("w", "x", "y", "z")
        );
        int n = digits.length();
        List<String> list = new ArrayList<>();
        if (n == 0) return list;
        if (n == 1) return map.get(digits.charAt(0));

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                List<String> l = new ArrayList<>();
                if (n == 2) {
                    for (String s1 : map.get(digits.charAt(i))) {
                        for (String s2 : map.get(digits.charAt(j))) {
                            l.add(s1 + s2);
                        }
                    }
                } else {
                    for (int k = j + 1; k < n; k++) {
                        if (n == 3) {
                            for (String s1 : map.get(digits.charAt(i))) {
                                for (String s2 : map.get(digits.charAt(j))) {
                                    for (String s3 : map.get(digits.charAt(k))) {
                                        l.add(s1 + s2 + s3);
                                    }
                                }
                            }
                        } else if (n == 4) {
                            for (int m = k + 1; m < n; m++) {
                                for (String s1 : map.get(digits.charAt(i))) {
                                    for (String s2 : map.get(digits.charAt(j))) {
                                        for (String s3 : map.get(digits.charAt(k))) {
                                            for (String s4 : map.get(digits.charAt(m))) {
                                                l.add(s1 + s2 + s3 + s4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                list.addAll(l);
            }
        }

        return list;
    }
}