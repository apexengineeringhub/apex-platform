# Git Commit Convention

## Format

```text
<type>(<scope>): <description>

Example: 
feat(api): add health check endpoint
```
## Rules

- Use lowercase.
- Use imperative verbs (add, update, fix, remove).
- Keep the summary under 72 characters when possible.
- One commit should represent one logical change.

## Common Commit Type 
```text
feat - New feature
fix  - Bug fix
refactor  - Code refactoring
test      - Unit/Integration tests
chore     - Maintenance work
style     - Formatting only
build     - Build configuration
ci        - CI/CD changes
perf      - Performance improvements
docs      - Documentation changes
```


## Examples
```text
feat(api): add health check endpoint

docs(status): update project status

docs(handbook): add git commit convention

docs(logbook): add engineering logbook for 2026-07-03

docs(journal): add Spring Boot dependency injection notes

refactor(service): simplify health service

test(controller): add health controller tests

chore(project): initialize Spring Boot project
```

