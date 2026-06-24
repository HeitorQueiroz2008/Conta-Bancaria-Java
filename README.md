## Desafio

Criar uma conta bancária capaz de realizar as seguintes operações:

- Consultar saldo
- Consultar cheque especial
- Depositar dinheiro
- Sacar dinheiro
- Pagar boletos
- Verificar se a conta está utilizando cheque especial

## Regras de Negócio

- A conta bancária deve possuir um limite de cheque especial somado ao saldo da conta.
- O valor do cheque especial é definido no momento da criação da conta.
- Se o valor depositado na criação da conta for de até R$ 500,00, o cheque especial deve ser de R$ 50,00.
- Para valores acima de R$ 500,00, o cheque especial deve ser equivalente a 50% do valor depositado.
- Caso o cheque especial seja utilizado, a conta deve cobrar uma taxa de 20% sobre o valor utilizado assim que possível.

## Funcionalidades Implementadas

- [x] Consultar saldo
- [x] Consultar cheque especial
- [x] Depositar dinheiro
- [ ] Sacar dinheiro
- [ ] Pagar boleto
- [ ] Verificar uso do cheque especial
- [ ] Menu interativo
- [ ] Encerrar aplicação

## Conceitos Praticados

- Classes e Objetos
- Encapsulamento
- Construtores
- Métodos
- Getters e Setters
- Entrada de dados com Scanner