package com.example.demo.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.WeekendPlan;

@Service
public class WeekendPlanService {

        public List<WeekendPlan> getWeekendPlans() {
                return List.of(
                                new WeekendPlan(
                                                "LAN party de precision quirurgica",
                                                "Ranking de juegos + benchmark de quien tiene mejor setup",
                                                "0-20 EUR",
                                                "Alta",
                                                "Si baja el ping, sube el autoestima"),
                                new WeekendPlan(
                                                "Hackaton casera de side projects",
                                                "4 horas para lanzar algo inutil pero legendario",
                                                "0-15 EUR",
                                                "Media",
                                                "No facturara, pero tendra README bonito"),
                                new WeekendPlan(
                                                "Noche retro: emuladores y pizza",
                                                "Torneo de clasicos con mando sospechoso",
                                                "5-15 EUR",
                                                "Alta",
                                                "El campeon se lleva una keycap dorada imaginaria"),
                                new WeekendPlan(
                                                "CTF de sabado con cafe",
                                                "Retos de seguridad para presumir en LinkedIn el lunes",
                                                "0-12 EUR",
                                                "Alta",
                                                "Si no lo resuelves, dices que era una honeypot"),
                                new WeekendPlan(
                                                "Maraton sci-fi + teardown tecnico",
                                                "Ver peli futurista y criticar su arquitectura de sistemas",
                                                "8-25 EUR",
                                                "Media",
                                                "Conclusion oficial: demasiada IA, pocos tests"),
                                new WeekendPlan(
                                                "Domingo de automatizacion zen",
                                                "Scripts para ahorrarte 7 clicks absurdos de la semana",
                                                "0 EUR",
                                                "Baja",
                                                "Si tarda menos de 30s, ya cuenta como DevOps"),
                                new WeekendPlan(
                                                "Brunch y refactor con amistades tech",
                                                "Code review amistosa con memes de deuda tecnica",
                                                "10-22 EUR",
                                                "Media",
                                                "Se aprueba todo menos los nombres como data2final_ok"),
                                new WeekendPlan(
                                                "Ruta de tiendas frikis",
                                                "Cazar gadgets inutiles pero emocionalmente necesarios",
                                                "15-40 EUR",
                                                "Media",
                                                "La compra impulsiva se llama inversion en productividad"),
                                new WeekendPlan(
                                                "Speedrun de backlog domestico",
                                                "Resolver tareas pendientes con cronometro y cero dignidad",
                                                "0 EUR",
                                                "Media",
                                                "Si lo haces con tablero Kanban, ya es metodologia"),
                                new WeekendPlan(
                                                "Cata de cafes y teclados",
                                                "Comparar switches mientras finges que distingues notas citricas",
                                                "12-28 EUR",
                                                "Media",
                                                "El mejor teclado siempre es el proximo"),
                                new WeekendPlan(
                                                "Mini torneo de juegos de mesa hardcore",
                                                "Traicion elegante, reglas infinitas y snacks estrategicos",
                                                "8-18 EUR",
                                                "Alta",
                                                "Pierdes una amistad, ganas lore"),
                                new WeekendPlan(
                                                "Safari de bugs legacy",
                                                "Abrir un proyecto viejo y negociar con decisiones del pasado",
                                                "0 EUR",
                                                "Baja",
                                                "No es deuda tecnica, es arqueologia aplicada"),
                                new WeekendPlan(
                                                "Picnic con benchmark humano",
                                                "Salir al parque y medir quien aguanta mas sin mirar el movil",
                                                "6-20 EUR",
                                                "Media",
                                                "El verdadero challenge es no hablar de trabajo"),
                                new WeekendPlan(
                                                "Laboratorio de mocktails futuristas",
                                                "Inventar bebidas con nombres de startup fallida",
                                                "9-24 EUR",
                                                "Media",
                                                "Serie A de sabor, seed de resaca cero"),
                                new WeekendPlan(
                                                "Museo, libreta y mode main character",
                                                "Paseo cultural con opiniones intensas sobre cuadros abstractos",
                                                "5-18 EUR",
                                                "Baja",
                                                "Si no entiendes la obra, dices que es post-cloud"),
                                new WeekendPlan(
                                                "Cine cutre con review tecnica",
                                                "Ver una peli mala y detectar todos sus errores de continuidad",
                                                "7-16 EUR",
                                                "Baja",
                                                "Una estrella por entretenimiento accidental"),
                                new WeekendPlan(
                                                "Taller express de cocina debuggeable",
                                                "Receta simple, pasos medibles y rollback en forma de delivery",
                                                "10-26 EUR",
                                                "Media",
                                                "Si falla, cambias el nombre a version deconstruida"),
                                new WeekendPlan(
                                                "Mercadillo vintage y captura de tesoros",
                                                "Buscar reliquias utiles o por lo menos muy fotogenicas",
                                                "5-35 EUR",
                                                "Media",
                                                "Todo objeto raro merece una narrativa exagerada"),
                                new WeekendPlan(
                                                "Noche de karaoke con observabilidad",
                                                "Cantar temazos y documentar incidentes vocales en tiempo real",
                                                "8-22 EUR",
                                                "Alta",
                                                "Lo importante no es afinar, es tener dashboard"),
                                new WeekendPlan(
                                                "Club de lectura para gente que subraya commits",
                                                "Leer sci-fi corta y debatir implicaciones tecnicas imposibles",
                                                "0-14 EUR",
                                                "Baja",
                                                "Spoiler: la solucion nunca era meter mas microservicios"));
        }

        public String getFridayHeadline() {
                DayOfWeek day = LocalDate.now().getDayOfWeek();
                if (day == DayOfWeek.FRIDAY) {
                        return "Es viernes: backlog en pausa y modo friki en produccion";
                }

                return "Calentando compiladores para un finde muy nerd";
        }
}
