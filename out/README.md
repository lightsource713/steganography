# Informações:

- A pasta "/out" serve para salvar todas as fotos com a esteganografia já aplicada.

- Para solucionar este desafio, você deverá inserir a sua imagem dentro de um dos 3 itens: 
```bash
    String imagemEmbutidaTexto = pathIn + "TEXTO-EMBUTIDO.png";				
	String imagemEmbutidaFigura = pathIn + "FIGURA-EMBUTIDA.png";
```

# Observações:
- Logo após isso, você irá inserir suas fotos na Classe EsteganografiaReverso, assim:
```bash
# Exemplo: Localizado na linha 9
String imagemEmbutidaTexto = pathIn + "texto-embutido.png";
String imagemEmbutidaFigura = pathIn + "figura-embutida.png";
```

- Para você conseguir achar o texto/figura correta, você irá colocar um arquivo no qual você acha que é o verdadeiro, tentando foto por foto, até encontrar a verdadeira.
```bash
# Exemplo: 
 Sua imagem com o texto embutido verdadeiro é "CACHORRO.png", porém você colocou um outro arquivo: "CASA.jpg". resultará em falha.
 Na próxima tentativa você irá tentar "MAÇA.jpg", resultará em falha novamente, até que você insira "CACHORRO.png".
```

# Desafio:

- Seu desafio é desvendar quais são as fotos, textos e ícones estão escondidas nas imagens.