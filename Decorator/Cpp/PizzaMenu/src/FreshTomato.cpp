/*
 * FreshTomato.cpp
 *
 *  Created on: Jan 18, 2021
 *      Author: nquang
 */

#include "FreshTomato.h"

FreshTomato::FreshTomato(Pizza *component) {
	this->component_ = component;
}
int FreshTomato::getCost() const {
	return this->component_->getCost() + this->cost;
}
string FreshTomato::getName() const {
	return this->name + this->component_->getName();
}
string FreshTomato::getDescription() const {
	return this->component_->getDescription() + this->name;
}
