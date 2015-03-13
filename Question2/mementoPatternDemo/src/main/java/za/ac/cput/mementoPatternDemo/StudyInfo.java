package za.ac.cput.mementoPatternDemo;

/**
 * Created by student on 2015/03/13.
 */
public class StudyInfo {
    String subject;
    String topic;
    int chapter;

    public StudyInfo(String subject, String topic, int chapter) {
        this.subject = subject;
        this.topic = topic;
        this.chapter = chapter;
    }

    public void setTopicAndChapter(String topic, int chapter)
    {
        this.topic = topic;
        this.chapter = chapter;
    }
    public Memento save(){
        return new Memento(subject,topic,chapter);
    }
    public void restore(Object objMemento) {
        Memento memento = (Memento) objMemento;
        subject = memento.mSubject;
        topic = memento.mTopic;
        chapter = memento.mChapter;
    }

    private class Memento{
        String mSubject;
        String mTopic;
        int mChapter;

        public Memento(String mSubject, String mTopic, int mChapter) {
            this.mSubject = mSubject;
            this.mTopic = mTopic;
            this.mChapter = mChapter;
        }
    }

    public String toString()
    {
        return "Subject : "+subject+" Topic : "+topic+" Chapter : "+chapter;
    }
}
