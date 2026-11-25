# Restore a disposable WordPress site

AI-assisted practice guide. A restore has yet to be recorded.

1. Set up an isolated local WordPress site and add a fictional post and a synthetic media file. Record the post title, its URL path and the media filename.
2. Export the local database and copy the site files into a folder outside the Git working tree. Keep local configuration and backups off GitHub.
3. Prepare a separate local site directory and an empty database. Restore the copy into those targets and configure the restored site with local credentials. If the URL differs, use WordPress-aware tooling to update the site URLs.
4. Open the restored site. Compare the post title, content and permalink with the source, and confirm the media loads from the restored copy.
5. Record the checks that passed, anything you had to fix and the elapsed time. Keep the exercise notes free of credentials and database contents.

| Check | Expected | Result |
| --- | --- | --- |
| Post | Title and text match the fictional source post | Pending |
| Media | The synthetic file loads from the restored site | Pending |
| Permalink | The restored URL opens the expected post | Pending |
