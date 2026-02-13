Para poder usar estos GitHub Agentic Workflows es necesario instalar una extensión de GitHub CLI:

```bash
gh extension install github/gh-aw
```

Si tienes problemas de autenticación durante lainstalación puedes usar este otro comando:

```bash
curl -sL https://raw.githubusercontent.com/github/gh-aw/main/install-gh-aw.sh | bash
```

Para un primer ejemplo he utilizado el ejemplo daily-repo-status, que se ejecuta diariamente y crea un reporte de estado del repositorio. Puedes encontrar el código en el archivo .github/workflows/daily-repo-status.md.


Una vez que ya lo tienes ahí lo único que necesitas hacer es ejecutar el siguiente comanndo:

```bash
gh aw compile
```

Esto tomará todos los markdowns del directorio .github/workflows, los compilará y los convertirá en archivos YAML que se colocarán en el directorio .github/workflows/compiled. Estos archivos YAML son los que realmente se ejecutarán como GitHub Actions.