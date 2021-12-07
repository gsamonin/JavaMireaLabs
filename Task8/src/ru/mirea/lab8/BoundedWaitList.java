package ru.mirea.lab8;
import java.util.Collection;
public class BoundedWaitList <E> extends WaitList<E> {
        private int capacity;
        public BoundedWaitList(int capacity){
            super();
            if(capacity <= 0) throw new IllegalArgumentException("Максимальный размер должен быть больше 0! Получено значение: " + capacity); // создание нового объекта без каких-либо данных
            this.capacity = capacity;
        }
        public BoundedWaitList(Collection<E> col){
            super(col);
            this.capacity = col.size();
        }

        public int getCapacity() {
            return capacity;
        }
        public void add(E element) {
            if(components.size() == capacity) throw new IllegalStateException("Очередь заполнена!"); // метод добавления элемента в очередь
            components.add(element);
        }
        public String toString() {
            return "BoundedWaitList{" +
                    "capacity=" + capacity +
                    ", components=" + components + // вывод
                    '}';
        }
}
