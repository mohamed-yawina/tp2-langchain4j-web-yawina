
# Utilisation de l'IA — TP2 LangChain4j Web

**Étudiant :** Mohamed Yawina  
**Groupe :** G1 — N° 26  
**Enseignant :** Richard Grin  
**Projet :** Application Web LangChain4j  
**Dépôt :** https://github.com/mohamed-yawina/tp2-langchain4j-web-yawina

## 1. Présentation

J'ai utilisé ChatGPT comme assistant pédagogique pendant le développement de mon application Web Jakarta EE avec LangChain4j.

L'IA m'a aidé à comprendre les concepts, analyser certaines difficultés techniques et vérifier les étapes de réalisation.

## 2. Configuration du projet

**Problème :** Comprendre la configuration d'un projet Maven utilisant Jakarta EE 11, JSF, PrimeFaces et LangChain4j.

**Pourquoi l'IA :** M'aider à identifier le rôle des dépendances et les éléments nécessaires au déploiement.

**Question reformulée :** Comment configurer un projet Jakarta EE avec JSF, PrimeFaces et LangChain4j pour fonctionner sur Payara ?

**Résumé de l'aide :** Explications sur `pom.xml`, les dépendances, la structure d'une application WAR et le déploiement sur Payara.

**Ce que j'ai appris :** Maven gère les dépendances, Jakarta EE fournit les composants serveur et PrimeFaces facilite la création des interfaces JSF.

## 3. Intégration de Gemini

**Problème :** Comprendre comment appeler Gemini depuis une application Web Java.

**Pourquoi l'IA :** Comprendre l'initialisation du modèle et l'organisation du code.

**Question reformulée :** Comment intégrer Gemini avec `GoogleGenAiChatModel` et `AiServices` dans une application Jakarta EE ?

**Résumé de l'aide :** Explications sur `GoogleGenAiChatModel`, l'interface `Assistant`, le composant `LlmClient` et la variable d'environnement `GEMINI_KEY`.

**Ce que j'ai appris :** `AiServices` permet d'utiliser une interface Java pour communiquer avec le modèle. La clé API peut être récupérée depuis une variable d'environnement.

## 4. Mémoire conversationnelle

**Problème :** Comprendre comment conserver les échanges d'une conversation et réinitialiser son historique.

**Pourquoi l'IA :** Comprendre le rôle de `MessageWindowChatMemory`.

**Question reformulée :** Comment conserver les messages précédents avec LangChain4j et les effacer lorsqu'un utilisateur commence un nouveau chat ?

**Résumé de l'aide :** Explications sur `MessageWindowChatMemory.withMaxMessages(20)`, l'historique et la réinitialisation de la mémoire.

**Ce que j'ai appris :** La mémoire permet de conserver un contexte conversationnel limité. Un nouveau chat doit repartir sans les informations de la conversation précédente.

## 5. Interface JSF et PrimeFaces

**Problème :** Relier les composants de l'interface aux méthodes Java du bean JSF.

**Pourquoi l'IA :** Mieux comprendre `@Named`, `@ViewScoped`, les actions et la mise à jour des composants.

**Question reformulée :** Comment utiliser un bean JSF avec PrimeFaces pour envoyer des messages, afficher les réponses et réinitialiser une conversation ?

**Résumé de l'aide :** Explications sur le rôle du bean, la liaison des composants XHTML et les interactions avec `LlmClient`.

**Ce que j'ai appris :** JSF relie les composants de l'interface aux propriétés et méthodes Java. Le bean gère les actions de l'utilisateur et les informations affichées.

## 6. Rôles de l'assistant

**Problème :** Comprendre comment modifier le comportement de l'assistant selon le rôle choisi.

**Pourquoi l'IA :** Comprendre l'utilisation de `SystemMessage` et l'importance de réinitialiser la mémoire.

**Question reformulée :** Comment changer le rôle de l'assistant avec un message système sans conserver les instructions de l'ancien rôle ?

**Résumé de l'aide :** Explications sur les messages système et sur la réinitialisation de la conversation lors d'un changement de rôle.

**Ce que j'ai appris :** Un message système peut orienter le comportement du modèle. Il faut éviter de mélanger les contextes de plusieurs rôles.

## 7. Vérification de l'application

J'ai vérifié le fonctionnement de l'application sur Payara avec plusieurs scénarios :

- Traduction de « bonjour » en « Hello ».
- Conservation du prénom et des études pendant une conversation.
- Réinitialisation avec « Nouveau chat ».
- Vérification de l'absence de mémoire après réinitialisation.
- Sélection des différents rôles.

Ces tests m'ont permis de mieux comprendre le fonctionnement de la mémoire conversationnelle et les interactions entre JSF et LangChain4j.

## 8. Bilan personnel

Ce TP m'a permis de découvrir comment intégrer un modèle de langage dans une application Web Java.

L'utilisation de ChatGPT m'a aidé à comprendre plusieurs notions techniques, notamment les composants Jakarta EE, `AiServices`, la mémoire conversationnelle et les messages système.

J'ai également appris à vérifier le fonctionnement d'une application à travers des scénarios concrets.

L'objectif de cette utilisation était de progresser dans la compréhension du TP et de son fonctionnement.
