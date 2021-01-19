/*
 * main.cpp
 *
 *  Created on: Jan 19, 2021
 *      Author: nquang
 */

#include <iostream>
using namespace std;

/*
 * interface: Button
 */
class Button {
public:
	virtual ~Button(){};
	virtual void render() = 0;
	virtual void onClick() = 0;
};

/*
 * Concrete component extends interface: WindowsButton
 */

class WindowsButton : public Button {
public:
	void render() override {
		cout << "Render Windows button" << endl;
	}
	void onClick() override {
		cout << "Created process for handling this onclick windows button event" << endl;
	}
};

/*
 * Concrete component extends interface: HTMLButton
 */

class HTMLButton : public Button {
public:
	void render() override {
		cout << "Render HTML button" << endl;
	}
	void onClick() override {
		cout << "Created process for handling this onclick html button event" << endl;
	}
};

class Dialog {
protected:
	Button *button;
public:
	virtual ~Dialog(){};
	virtual Button* createButton() = 0;

	void render() {
		Button *button = createButton();
		button->onClick();
		button->render();
	}
};

class WindowsDialog : public Dialog {
public:
	Button* createButton() override {
		return new WindowsButton();
	}
};

class HTMLDialog : public Dialog {
public:
	Button* createButton() override {
		return new HTMLButton();
	}
};


int main() {

	Dialog *windowsButton = new WindowsDialog();
	windowsButton->render();

	Dialog *htmlButton = new HTMLDialog();
	htmlButton->render();

	return 0;
}


