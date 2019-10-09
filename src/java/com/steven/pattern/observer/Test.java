package com.steven.pattern.observer;

public class Test
{
	public static void main(String[] args)
	{
		Watched girl = new ConcreteWatched();
		
		Watcher watcher1 = new ConcreteWatcher();
		Watcher watcher2 = new ConcreteWatcher();
		Watcher watcher3 = new ConcreteWatcher();
		
		girl.addWatcher(watcher1);
		girl.addWatcher(watcher2);
		girl.addWatcher(watcher3);
		
		girl.notifyWatchers("There are so many people are watching me,I am so Happy");
		
		girl.removeWatcher(watcher2);
		
		girl.notifyWatchers("Somebody is not watching me again,I am not Happy");
		
		
		
	}
}
