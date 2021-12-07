package ru.mirea.lab8;

public class UnfairWaitList <E> extends WaitList<E> {
        public UnfairWaitList() {
            super();
        }
        public void remove (E element){
            // components.remove(element)
            boolean removed = false;
            for(int i = 0; i < components.size(); i++){ //удаление элемента из очереди
                E el = components.remove();
                if(!removed && el.equals(element)){
                    removed = true; // i--
                }else{
                    components.add(el);
                }
            }
            if(removed){
                components.add(components.remove());
            }
        }
        public void moveToBack(E element){
            int prevSize = components.size(); //метод сдвига элемента в конец очереди
            remove(element);
            if(components.size() < prevSize){
                components.add(element);
            }
        }
}
