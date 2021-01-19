/*
 * main.cpp
 *
 *  Created on: Jan 19, 2021
 *      Author: nquang
 */

#include <iostream>
using namespace std;

class IFan {
public:
	virtual ~IFan(){};
	virtual void plug() = 0;
	virtual void switchOn() = 0;
};

class TableFan : public IFan {
public:
	void plug() override {
		cout << "Provide power for TableFan" << endl;
	}
	void switchOn() override {
		cout << "Switch TableFan on" << endl;
	}
};

class CeilingFan : public IFan {
public:
	void plug() override {
		cout << "Provide power for CeilingFan" << endl;
	}
	void switchOn() override {
		cout << "Switch CeilingFan on" << endl;
	}
};

class ExhaustFan : public IFan {
public:
	void plug() override {
		cout << "Provide power for ExhaustFan" << endl;
	}
	void switchOn() override {
		cout << "Switch ExhaustFan on" << endl;
	}
};

class IFanFactory {
public:
	virtual ~IFanFactory(){};
	virtual IFan* createFan() = 0;
	void turnOn() {
		IFan* fan = createFan();
		fan->plug();
		fan->switchOn();
	}
};

class TableFanFactory : public IFanFactory {
public:
	IFan* createFan() override {
		return new TableFan();
	}
};

class CeilingFanFactory : public IFanFactory {
public:
	IFan* createFan() override {
		return new CeilingFan();
	}
};

class ExhaustFanFactory : public IFanFactory {
public:
	IFan* createFan() override {
		return new ExhaustFan();
	}
};

int main() {
	IFanFactory* newTableFan = new TableFanFactory();
	newTableFan->turnOn();
	delete newTableFan;

	IFanFactory* newExhaustFan = new ExhaustFanFactory();
	newExhaustFan->turnOn();


	return 0;
}


