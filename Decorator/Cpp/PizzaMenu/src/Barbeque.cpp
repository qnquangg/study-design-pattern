/*
 * Barbeque.cpp
 *
 *  Created on: Jan 18, 2021
 *      Author: nquang
 */

#include "Barbeque.h"

Barbeque::Barbeque(Pizza *component) {
	this->component_ = component;
}
int Barbeque::getCost() const {
	return this->component_->getCost() + this->cost;
}
string Barbeque::getName() const {
	return this->name + this->component_->getName();
}
string Barbeque::getDescription() const {
	return this->component_->getDescription() + this->name;
}
