# 🛒 Proiect Java – Magazin Online (POO)

Acesta este un proiect scris în Java pentru gestionarea unui magazin online, realizat în cadrul laboratorului de Programare Orientată pe Obiecte.

## 📁 Structură proiect

# Clasele de bază (ex: Produs, Client, Comandă etc.) ├── service/ 
# Logica aplicației (ex: gestionare produse, comenzi) ├── data/ 
# Fișiere CSV sau surse externe ├── utils/ 
# Funcționalități auxiliare (ex: citire/scriere fișiere) ├── main.java 
# Punctul de pornire al aplicației

## ✅ Funcționalități

- Adăugare produse și clienți
- Plasare comenzi
- Citire/scriere din fișiere CSV
- Logare acțiuni în `audit.csv`
- Sisteme simple de căutare și listare

## 🛠️ Tehnologii

- Java 17+
- Programare Orientată pe Obiecte
- Fișiere CSV pentru persistență
- Design modular (separare model-service-logică)

## ▶️ Cum se rulează

1. Compilează tot codul:

```bash
javac model/*.java service/*.java utils/*.java main.java
