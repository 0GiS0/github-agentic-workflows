# 🤖 GitHub Agentic Workflows

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.2-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![GitHub Agentic Workflows](https://img.shields.io/badge/gh--aw-enabled-blue.svg)](https://github.com/github/gh-aw)

A demonstration repository showcasing **GitHub Agentic Workflows** using AI-powered automation to enhance repository management and issue handling.

## 📋 Table of Contents

- [About the Project](#-about-the-project)
- [Prerequisites](#-prerequisites)
- [Installation](#-installation)
- [Project Structure](#-project-structure)
- [Agentic Workflows](#-agentic-workflows)
- [Demo Application](#-demo-application)
- [Usage](#-usage)
- [Contributing](#-contributing)

## 🎯 About the Project

This repository demonstrates how to use **GitHub Agentic Workflows** (`gh-aw`) to automate various repository management tasks using AI agents. The project includes:

- 🤖 AI-powered workflow automation
- 📊 Daily repository status reports
- ✨ Automatic issue quality enhancement
- 🌱 A sample Spring Boot application for demonstration

## 🔧 Prerequisites

Before you can use GitHub Agentic Workflows, you need:

- ✅ [GitHub CLI](https://cli.github.com/) installed
- ✅ A GitHub account with repository access
- ✅ Java 21 (for running the demo application)

## 📥 Installation

### Step 1: Install the GitHub Agentic Workflows Extension

Install the `gh-aw` extension using one of the following methods:

**Method 1: Direct installation**
```bash
gh extension install github/gh-aw
```

**Method 2: Alternative installation (if authentication issues occur)**
```bash
curl -sL https://raw.githubusercontent.com/github/gh-aw/main/install-gh-aw.sh | bash
```

### Step 2: Verify Installation

```bash
gh aw version
```

## 📁 Project Structure

```
github-agentic-workflows/
├── 📂 .github/
│   └── 📂 workflows/
│       ├── daily-repo-status.md          # Daily status report workflow
│       ├── issue-quality-enhancer.md     # Issue enhancement workflow
│       ├── dependabot-security-analyzer.md # Dependabot vulnerability triage workflow
│       ├── daily-repo-status.lock.yml    # Compiled workflow
│       ├── issue-quality-enhancer.lock.yml # Compiled workflow
│       ├── dependabot-security-analyzer.lock.yml # Compiled workflow
│       └── package.json                  # Workflow MCP dependencies
├── 📂 src/
│   └── 📂 main/
│       ├── 📂 java/com/example/demo/
│       │   ├── DemoApplication.java      # Spring Boot main class
│       │   ├── 📂 controller/
│       │   │   └── ItemController.java   # REST API controller
│       │   ├── 📂 model/
│       │   │   └── Item.java            # Item entity
│       │   └── 📂 service/
│       │       └── ItemService.java     # Business logic
│       └── 📂 resources/
│           └── application.yml          # Application configuration
├── build.gradle                         # Gradle build configuration
├── settings.gradle                      # Gradle settings
└── README.md                           # This file
```

## 🤖 Agentic Workflows

This repository includes three example workflows:

### 1. 📊 Daily Repo Status

**File:** `.github/workflows/daily-repo-status.md`

Automatically generates a daily status report including:
- Recent repository activity (issues, PRs, discussions, releases)
- Progress tracking and goal reminders
- Project status and recommendations
- Actionable next steps for maintainers

**Schedule:** Daily
**Permissions:** `contents:read`, `issues:read`, `pull-requests:read`

### 2. ✨ Issue Quality Enhancer

**File:** `.github/workflows/issue-quality-enhancer.md`

Automatically enhances newly opened issues by:
- Adding emoji prefixes based on issue type (🐛 Bug, ✨ Feature, 📝 Docs, etc.)
- Structuring the content with clear sections
- Translating non-English issues to English
- Applying relevant labels

**Trigger:** When issues are opened
**Engine:** Copilot
**Permissions:** `issues:read`

### 3. 🛡️ VulnScope PR Guard

**File:** `.github/workflows/dependabot-security-analyzer.md`

Analyzes Dependabot pull requests on demand (`/dependabot-analyze`) to determine:
- Whether the vulnerable dependency is used in an exploitable way
- The correct priority for remediation (`priority:high` or `priority:low`)
- Detailed evidence with code references and advisory sources

**Trigger:** Slash command on PR comments (`/dependabot-analyze`)
**Engine:** Copilot
**Permissions:** `contents:read`, `pull-requests:read`, `security-events:read`

## 🌱 Demo Application

This repository includes a Spring Boot REST API application for demonstration purposes:

### Technologies Used

- ☕ **Java 21**
- 🍃 **Spring Boot 3.2.2**
- 🔄 **Spring Web** - RESTful API
- ✅ **Spring Validation** - Input validation
- 🧪 **JUnit 5** - Testing framework

### API Endpoints

The demo application provides a simple Item management API:

- `GET /api/items` - List all items
- `GET /api/items/{id}` - Get item by ID
- `POST /api/items` - Create a new item
- `PUT /api/items/{id}` - Update an item
- `DELETE /api/items/{id}` - Delete an item

### Running the Demo Application

```bash
# Build the application
./gradlew build

# Run the application
./gradlew bootRun

# Run tests
./gradlew test
```

The application will start on `http://localhost:8080`.

## 🚀 Usage

### Compiling Workflows

Once you have created your workflow markdown files in `.github/workflows/`, compile them:

```bash
gh aw compile
```

This command will:
1. 📖 Read all markdown files from `.github/workflows/`
2. 🔄 Compile them into GitHub Actions YAML workflows
3. 💾 Save the compiled files as `.lock.yml` files in the same directory
4. ✅ These YAML files will be executed as GitHub Actions

### Creating Custom Workflows

1. Create a new markdown file in `.github/workflows/` (e.g., `my-workflow.md`)
2. Define the workflow configuration in the frontmatter (YAML between `---` markers)
3. Write your workflow instructions in markdown format
4. Run `gh aw compile` to generate the YAML workflow
5. Commit and push the changes to activate the workflow

### Example Workflow Structure

```markdown
---
on:
  schedule: daily
permissions:
  contents: read
tools:
  github:
---

# My Custom Workflow

[Your workflow instructions here]
```

## 🤝 Contributing

Contributions are welcome! Feel free to:

- 🐛 Report bugs
- ✨ Suggest new features
- 📝 Improve documentation
- 🔧 Submit pull requests

## 📚 Resources

- [GitHub Agentic Workflows Documentation](https://github.com/github/gh-aw)
- [GitHub CLI Documentation](https://cli.github.com/)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)

---

> 💡 **Tip:** Issues created in this repository are automatically enhanced by the Issue Quality Enhancer workflow!

---

**Made with ❤️ using GitHub Agentic Workflows**