# Web development labs

AI-assisted learning examples for local practice. The exercises use fictional data and are separate from the academic projects linked on the GitHub profile.

| Exercise | Status |
| --- | --- |
| [Java quantity total](java/QuantityTotal.java) | Compiled for Java 17 and checked with seven command-line cases. |
| [WordPress event card](wordpress/community-event-card.php) | Source and local setup available. WordPress integration check pending. |
| [Local hosting and restore](hosting/restore-checklist.md) | Checklist available. Backup and restore exercise pending. |

## Java

With JDK 17 or newer, from the repository root:

```sh
javac -d build java/QuantityTotal.java
java -cp build QuantityTotal 2 3 7
```

Expected standard output: `12`. The checks also covered a total above the 32-bit integer range and rejection of missing, zero, negative, malformed and out-of-range arguments. Rejected inputs print an error on standard error and return exit code 2.

## WordPress

On a disposable local site, copy `wordpress/community-event-card.php` into `wp-content/plugins/community-event-card/`, activate **Community Event Card**, then add a Shortcode block to a page:

```text
[learning_event_card title="Community coding evening" venue="Example Library"]
```

Preview the page and check that the title and venue appear as text. Try the shortcode without attributes to check the defaults. The shortcode escapes both values before building its HTML. The child-theme exercise remains a future step.

## Hosting

Use the [restore checklist](hosting/restore-checklist.md) on a separate local copy. Record the outcome after completing the restore.
