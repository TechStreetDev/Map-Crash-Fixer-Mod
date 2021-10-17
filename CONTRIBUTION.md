Contributing
============

Thank you for your interest in contributing to the mod!

If you're submitting a feature, base your code on `1.17.1` and PR against the
`1.17.1` branch.

Checklist
---------

Ready to submit? Perform the checklist below:

1. Have all tabs been replaced into four spaces? Are indentations 4-space wide?
2. Have I combined my commits into a reasonably small number (if not one) commit using `git rebase`?
3. Have I made my pull request too large? Pull requests should introduce small sets of changes at a time. Major changes should be discussed with the team prior to starting work.
4. Are my commit messages descriptive?

You should be aware of [`git rebase`](http://learn.github.com/p/rebasing.html).
It allows you to modify existing commit messages, and combine, break apart, or adjust past changes.

Examples
-------

### Code style
This is **GOOD:**

```java
    if (var.func(param1, param2)) {
        // do things
    }
```

This is **BAD:**
```java
    if(var.func( param1, param2 ))
    {
        // do things
    }
```