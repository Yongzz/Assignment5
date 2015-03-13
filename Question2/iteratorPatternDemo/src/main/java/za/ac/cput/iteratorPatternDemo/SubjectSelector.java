package za.ac.cput.iteratorPatternDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 2015/03/12.
 */
public class SubjectSelector {
    List<Subject> subject;
    SubjectSelector(){
        subject = new ArrayList<Subject>();
    }

    public void addSubject(Subject s)
    {
        subject.add(s);
    }

    public Iterator<Subject> iterator(){
         return new SubjectIterator();
    }

    class SubjectIterator implements Iterator<Subject>{

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return (currentIndex >=subject.size()) ;
        }

        @Override
        public Subject next() {
            return subject.get(currentIndex++);
        }

        @Override
        public void remove() {
            subject.remove(--currentIndex);
        }
    }
}
