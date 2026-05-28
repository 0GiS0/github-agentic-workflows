---
on:
  issues:
    types: [opened, reopened]

engine: copilot

permissions:
  issues: read

safe-outputs:
  update-issue:
    title:
    body:

tools:
  github:
    toolsets: [issues]
---

# Issue Quality Enhancer

Enhance new issues to make them clear, well-structured, and easy to understand.

## Issue to enhance

| Field  | Value          |
| ------ | -------------- |
| Number | #$ISSUE_NUMBER |
| Author | @$ISSUE_AUTHOR |
| Title  | $ISSUE_TITLE   |
| Body   | $ISSUE_BODY    |

## Your tasks

### 1. Get context

- Read the README to understand the project
- List the repository labels (you'll need them later)

### 2. Translate if needed

- If the issue is NOT in English, translate it to English
- Keep all technical details intact

### 3. Improve the title

Add an emoji prefix based on the issue type:

- 🐛 Bug
- ✨ Feature
- 📝 Docs
- 🔧 Refactor
- ⚡ Performance

Example: `🐛 Fix login error when password contains special characters`

### 4. Restructure the body

Use clear sections with emoji headers:

**For bugs:**

```
## 🐛 Description
## 📋 Steps to Reproduce
## ✅ Expected vs ❌ Actual Behavior
```

**For features:**

```
## ✨ Description
## 🎯 Why is this needed?
## 📐 Proposed Solution
```

### 5. Add footer

```
---
> ✍️ *Enhanced by Copilot. Original author: @$ISSUE_AUTHOR*
```

### 6. Apply changes

- **Update** issue #$ISSUE_NUMBER with the new title and body
- **Assign** 1-3 relevant labels
- **Comment** with a brief summary of improvements

## Rules

- Never change the original meaning
- If already well-written, make minimal changes
- Keep it helpful, not verbose
