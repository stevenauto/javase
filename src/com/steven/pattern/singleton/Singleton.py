#!/usr/bin/python
from _pyio import __metaclass__


class Singleton(object):
	_instance = None
	def __new__(cls, *args, **kwargs):
		if not cls._instance:
			cls._instance = super(Singleton,cls).__new__(cls,*args,**kwargs)
		return cls._instance
		
		
class MyClass(Singleton):
	a=1

class Singletons(type):
	def __init__(self,*args,**kwargs):
		self._instances = None
		super(Singletons,self).__init__(*args,**kwargs)
	def __call__(self, *args, **kwargs):
		if self._instances is None:
			self._instances = super(Singletons,self).__call__(*args,**kwargs)
			print "ddd"
		return self._instances
class Myclass2(object):
	__metaclass__=Singletons
	
one = MyClass()
two = MyClass()
three = Myclass2()
four = Myclass2()

if one is two:
	print id(one),id(two)
if two is four:
	print id(three),id(four)
else:
	print "wrong",id(three),id(four)