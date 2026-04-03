#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_SERVICES 100

/* Structure representing a transport service */
typedef struct {
    int  id;
    char name[50];
    int  start;   /* in minutes from midnight */
    int  finish;  /* in minutes from midnight */
} Service;

/* Convert HH:MM to minutes from midnight */
int toMinutes(int h, int m) {
    return h * 60 + m;
}

/* Print minutes as HH:MM */
void printTime(int minutes) {
    printf("%02d:%02d", minutes / 60, minutes % 60);
}

/* Comparator for qsort — sort by finish time ascending */
int compareByFinish(const void *a, const void *b) {
    Service *sa = (Service *)a;
    Service *sb = (Service *)b;
    return sa->finish - sb->finish;
}

/* Greedy interval scheduling algorithm */
int greedySchedule(Service services[], int n, int selected[]) {
    qsort(services, n, sizeof(Service), compareByFinish);

    int count      = 0;
    int lastFinish = 0;

    for (int i = 0; i < n; i++) {
        if (services[i].start >= lastFinish) {
            selected[count++] = i;
            lastFinish = services[i].finish;
        }
    }
    return count;
}

int main() {
    Service services[] = {
        {1, "City - Airport",   toMinutes(6,  0), toMinutes(7, 30)},
        {2, "City - Mall",      toMinutes(6, 45), toMinutes(8,  0)},
        {3, "Mall - Station",   toMinutes(7, 30), toMinutes(9,  0)},
        {4, "City - Park",      toMinutes(9,  0), toMinutes(10, 30)},
        {5, "Park - Airport",   toMinutes(9, 15), toMinutes(11,  0)},
        {6, "Station - City",   toMinutes(10,30), toMinutes(12,  0)},
        {7, "City - Suburb",    toMinutes(12, 0), toMinutes(13, 30)},
        {8, "Suburb - Central", toMinutes(13, 0), toMinutes(14, 30)},
        {9, "Central - Mall",   toMinutes(13,30), toMinutes(15,  0)},
    };

    int n = sizeof(services) / sizeof(services[0]);
    int selected[MAX_SERVICES];

    printf("=== Public Transport Timetable Scheduler ===\n");
    printf("Total services available: %d\n\n", n);

    printf("%-4s %-22s %-8s %-8s\n", "ID", "Route", "Start", "End");
    printf("%-4s %-22s %-8s %-8s\n", "--", "-----", "-----", "---");
    for (int i = 0; i < n; i++) {
        printf("%-4d %-22s ", services[i].id, services[i].name);
        printTime(services[i].start);
        printf("    ");
        printTime(services[i].finish);
        printf("\n");
    }

    int count = greedySchedule(services, n, selected);

    printf("\n=== Optimised Schedule (Max Non-Overlapping) ===\n");
    printf("%-4s %-22s %-8s %-8s\n", "ID", "Route", "Start", "End");
    printf("%-4s %-22s %-8s %-8s\n", "--", "-----", "-----", "---");
    for (int i = 0; i < count; i++) {
        int idx = selected[i];
        printf("%-4d %-22s ", services[idx].id, services[idx].name);
        printTime(services[idx].start);
        printf("    ");
        printTime(services[idx].finish);
        printf("\n");
    }

    printf("\nTotal services scheduled: %d / %d\n", count, n);
    return 0;
}
