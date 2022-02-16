package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.data.Films;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FilmsManager {
    private Films[] films = new Films[0];
    private int maxLimit = 10;

    public void save(Films film) {
        int length = films.length + 1;
        Films[] tmp = new Films[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Films[] findAll() {
        return films;
    }

    public Films[] findLast() {
        int resultLength;
        if (maxLimit > films.length) {
            resultLength = films.length;
        } else {
            resultLength = maxLimit;
        }

        Films[] result = new Films[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length -i - 1;
            result[i] = films[index];
        }
    return result;
        }
    }
