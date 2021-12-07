package ru.mirea.lab8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
    public class WaitList <E> implements IWaitList<E> {
        protected ConcurrentLinkedQueue<E> components;
        public WaitList(){
            components = new ConcurrentLinkedQueue<>(); // конструтор
        }
        public WaitList(Collection<E> collection){
            components = new ConcurrentLinkedQueue<>(collection); // конструктор для создания нового объекта с данными из некоторой коллекции.
        }
        public String toString() {
            return "WaitList{" +
                    "components=" + components +
                    '}'; // метод для вывода информации
        }
        public void add(E element) {
            components.add(element); // добавление элемента в конец очереди
        }
        public E remove() {
            if(isEmpty()) throw new IllegalStateException("Очередь пуста!");
            return components.remove(); // удалить элемент из очереди
        }
        public boolean contains(E element) {
            boolean res = false;
            for(int i = 0; i < components.size(); i++){ // метод для проверки значения равному элементу очереди
                E el = components.remove();
                if(el.equals(element)) res = true;
                components.add(el);}
            return res;}
        public boolean containsAll(Collection<E> collection) {
            ArrayList<E> al = new ArrayList<>(collection);
            for(int i = 0; i < collection.size(); i++){
                boolean res = false;
                for(int j = 0; j < components.size(); j++){
                    E el = components.remove();
                    if(el.equals(al.get(i))) res = true;
                    components.add(el);}
                if(!res) return false;}
            return true;}
        public boolean isEmpty() {
            return components.isEmpty(); // метод для проверки пуст элемент или нет
        }
}
