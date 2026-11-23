int[] a = {0, 2, 2, 42};
a.length == 4
a[0] + a[2] == 0 + 2
a[a[2]] == 2
a[2] == a[3]
a[1 + a[42]] == 2
// @expect-error: the last snippet throws on purpose
