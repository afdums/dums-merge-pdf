# PDFMergerPDFBox

## [EN] Description
The `PDFMergerPDFBox` class is a Java program that merges multiple PDF files into a single PDF. It uses the Apache PDFBox library to perform this operation.

### How It Works
- The program expects at least three arguments: the output PDF file name and at least two input PDF files.
- It utilizes `PDFMergerUtility` from PDFBox to merge the PDFs.
- The merged PDF is saved with the specified output filename.

### Requirements
- Java installed (JDK 11 or later recommended).
- Maven installed.
- Apache PDFBox dependency included in `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.apache.pdfbox</groupId>
        <artifactId>pdfbox</artifactId>
        <version>2.0.27</version>
    </dependency>
</dependencies>
```

### VS Code Configuration
1. Install "Extension Pack for Java" in VS Code.
2. Open the project folder in VS Code.
3. Ensure Maven and Java are properly configured by running:
   ```sh
   java -version
   mvn -version
   ```
4. Build the project:
   ```sh
   mvn clean package
   ```

### Running the Program
```sh
java -jar target/yourfile.jar output.pdf input1.pdf input2.pdf
```

---

## [PT] Descrição
A classe `PDFMergerPDFBox` é um programa Java que mescla múltiplos arquivos PDF em um único PDF. Ela utiliza a biblioteca Apache PDFBox para realizar essa operação.

### Como Funciona
- O programa espera pelo menos três argumentos: o nome do arquivo PDF de saída e pelo menos dois arquivos PDF de entrada.
- Ele utiliza `PDFMergerUtility` do PDFBox para mesclar os PDFs.
- O PDF mesclado é salvo com o nome de arquivo de saída especificado.

### Requisitos
- Java instalado (recomendado JDK 11 ou superior).
- Maven instalado.
- Dependência do Apache PDFBox incluída no `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.apache.pdfbox</groupId>
        <artifactId>pdfbox</artifactId>
        <version>2.0.27</version>
    </dependency>
</dependencies>
```

### Configuração do VS Code
1. Instale "Extension Pack for Java" no VS Code.
2. Abra a pasta do projeto no VS Code.
3. Certifique-se de que Maven e Java estão corretamente configurados executando:
   ```sh
   java -version
   mvn -version
   ```
4. Compile o projeto:
   ```sh
   mvn clean package
   ```

### Executando o Programa
```sh
java -jar target/seuarquivo.jar saida.pdf entrada1.pdf entrada2.pdf
```

