# 📚 Java Backend Learning Roadmap 2025

Repository ini digunakan untuk dokumentasi pembelajaran **Java Backend** dari dasar sampai modern & AI, termasuk Spring Boot, JPA, REST API, Security, dan Integrasi AI.

---

## 🗺️ Roadmap Pembelajaran

### Phase 1 — Java Core & OOP (Hari 1–6)
| Hari | Materi Utama | Sub-Materi / Fokus | Checklist |
|-----|---------------|------------------|----------|
| 1 | Java Basic | History Java, JVM, JDK & JRE, Hello World, Struktur Program Java, Comments, Compile & Run | [✅] |
| 2 | Java Basic | Variabel & Tipe Data (Primitive & Non-Primitive), Constants, Scope Variabel, Naming Convention | [ ] |
| 3 | Control Flow | If-Else, Switch, Ternary Operator, Loops (for, while, do-while), Break & Continue | [ ] |
| 4 | Method (Function) | Method Declaration, Parameter & Return Type, Method Overloading, Recursion, Static vs Instance Method | [ ] |
| 5 | OOP Basic & Encapsulation | Class & Object, Constructor, Access Modifier, Getter & Setter, `this` Keyword | [ ] |
| 6 | Inheritance & Polymorphism | Single & Multilevel Inheritance, Method Overriding, `super` Keyword, Polymorphism (Compile-time & Runtime) | [ ] |

### Phase 2 — Collection & Exception (Hari 7–10)
| Hari | Materi Utama | Sub-Materi / Fokus | Checklist |
|-----|---------------|------------------|----------|
| 7 | Interface & Abstraction | Interface vs Abstract Class, Abstract Methods, Implementing Interface, Default & Static Methods | [ ] |
| 8 | Collection Framework | List, Set, Map, Queue, Iteration, Wrapper Classes, Autoboxing & Unboxing | [ ] |
| 9 | Stream API & Lambda | Stream Creation, Intermediate & Terminal Operations, Filter, Map, Reduce, Lambda Expression, Method Reference | [ ] |
| 10 | Exception Handling | Try-Catch, Multiple Catch, Finally, Throw & Throws, Custom Exception, Checked vs Unchecked Exception | [ ] |

### Phase 3 — Database & JPA (Hari 11–13)
| Hari | Materi Utama | Sub-Materi / Fokus | Checklist |
|-----|---------------|------------------|----------|
| 11 | SQL Basic | SELECT, INSERT, UPDATE, DELETE, WHERE, JOIN, Aggregate Functions, GROUP BY & ORDER BY | [ ] |
| 12 | Database Design (ERD) | Entities, Attributes, Relationships (1:1, 1:N, N:M), Primary Key & Foreign Key, Normalization | [ ] |
| 13 | JPA & ORM | Entity Class, @Entity, @Id, @GeneratedValue, @Column, Repository, CRUD with JPA, @OneToOne, @OneToMany, @ManyToMany | [ ] |

### Phase 4 — Spring Boot & REST API (Hari 14–19)
| Hari | Materi Utama | Sub-Materi / Fokus | Checklist |
|-----|---------------|------------------|----------|
| 14 | Spring Boot Setup | Project Structure, Maven/Gradle Setup, Application Properties, Spring Boot Starter | [ ] |
| 15 | Dependency Injection | @Component, @Service, @Repository, @Autowired, Constructor & Setter Injection | [ ] |
| 16 | Configuration | application.properties/yml, Profiles, @Value, @Configuration, Bean Lifecycle | [ ] |
| 17 | REST GET & POST | @RestController, @RequestMapping, @GetMapping, @PostMapping, @RequestParam, @PathVariable, @RequestBody | [ ] |
| 18 | DTO & HTTP Status | DTO Pattern, @ResponseStatus, ResponseEntity, Best Practice API Response Structure | [ ] |
| 19 | Review & Mini Exercise | Full GET & POST Implementation, Testing with Postman, Debugging API | [ ] |

### Phase 5 — API Hardening (Hari 20–24)
| Hari | Materi Utama | Sub-Materi / Fokus | Checklist |
|-----|---------------|------------------|----------|
| 20 | Entity Mapping | @Entity, @Table, @Column, Mapping Strategies, Naming Conventions | [ ] |
| 21 | Relationship | @OneToOne, @OneToMany, @ManyToMany, CascadeType, FetchType, JoinColumn | [ ] |
| 22 | Pagination | Pageable, Page, Slice, Pagination Best Practices, Sorting | [ ] |
| 23 | Validation | Bean Validation, @NotNull, @Size, @Email, Custom Validator, @Valid | [ ] |
| 24 | Global Error Handling | @ControllerAdvice, @ExceptionHandler, Custom Error Response, Logging | [ ] |

### Phase 6 — Security (Hari 25–26)
| Hari | Materi Utama | Sub-Materi / Fokus | Checklist |
|-----|---------------|------------------|----------|
| 25 | Authentication | Basics of Security, Spring Security Setup, In-Memory & Database Authentication | [ ] |
| 26 | JWT-based Security | JWT Generation & Validation, Filters, Securing REST Endpoints, Roles & Authorities | [ ] |

### Phase 7 — Mini Project (Hari 27–30)
| Hari | Materi Utama | Sub-Materi / Fokus | Checklist |
|-----|---------------|------------------|----------|
| 27 | API Design | API Endpoint Design, REST Principles, DTO & Mapping, CRUD Planning | [ ] |
| 28 | Full CRUD Implementation | Create, Read, Update, Delete Endpoints, Exception Handling, Validation | [ ] |
| 29 | Testing | Unit Test (JUnit), Integration Test (Spring Boot Test), Postman Test Collection | [ ] |
| 30 | Refactor & Documentation | Code Cleanup, Logging, README Documentation, API Documentation (Swagger) | [ ] |

### Phase 8 — Modern & AI (Hari 31–37)
| Hari | Materi Utama | Sub-Materi / Fokus | Checklist |
|-----|---------------|------------------|----------|
| 31 | Java Modern Features | Records, Sealed Classes, Pattern Matching, Switch Expressions, Text Blocks | [ ] |
| 32 | Database Migration (Flyway) | Flyway Setup, Migration Scripts, Versioning Database Schema | [ ] |
| 33 | Spring AI & OpenAI Integration | Spring AI Starter, Calling OpenAI API, AI-powered Features, DTO & Response Handling | [ ] |
| 34 | Docker | Dockerfile, Docker Compose, Containerizing Spring Boot App, Networking Container | [ ] |
| 35 | AI-powered Backend Feature | Example AI Features, Recommendation System, Chatbot Integration, Error Handling | [ ] |
| 36 | Project Enhancement | Adding AI Feature to Mini Project, Testing & Validation | [ ] |
| 37 | Review & Deployment | Final Refactor, Documentation, Docker Deployment, CI/CD Tips | [ ] |

---

## ✅ Cara Menggunakan Repository Ini
1. Centang checklist tiap sub-materi setelah selesai dipelajari.
2. Simpan catatan kode & eksperimen di folder masing-masing hari.
3. Gunakan branch khusus untuk mini project dan modern & AI phase.
4. Update README ini jika ada tambahan catatan atau insight.

---



---
## FORMAT COMMIT 

| Type | Deskripsi |
|------|----------|
| feat | Menambahkan fitur baru |
| fix | Memperbaiki bug |
| refactor | Merapikan kode tanpa mengubah behavior |
| test | Menambah atau memperbaiki unit/integration test |
| docs | Perubahan dokumentasi |
| style | Perubahan format kode (indent, spasi, dll) |
| chore | Konfigurasi, dependency, build tools |
| perf | Optimasi performa |

contoh : BTJ01 - DOCS : updated explanation regarding the back to java roadmap


