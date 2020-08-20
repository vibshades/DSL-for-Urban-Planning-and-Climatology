/*
 * generated by Xtext 2.18.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.serializer.XbaseSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;
import org.xtext.fp.DesignCommercial;
import org.xtext.fp.DesignEducational;
import org.xtext.fp.DesignResidential;
import org.xtext.fp.DomainModel;
import org.xtext.fp.FpPackage;
import org.xtext.fp.Model;
import org.xtext.fp.caltreesBuildAction;
import org.xtext.fp.findtempBuilAction;
import org.xtext.fp.findtempCreateLake;
import org.xtext.fp.findtempCutTrees;
import org.xtext.fp.findtempDemolish;
import org.xtext.fp.findtempPlantBushes;
import org.xtext.fp.findtempPlantTrees;
import org.xtext.fp.findtempRemoveBushes;
import org.xtext.fp.findtempRemoveLake;
import org.xtext.fp.showRegion;
import org.xtext.services.MycnlGrammarAccess;

@SuppressWarnings("all")
public class MycnlSemanticSequencer extends XbaseSemanticSequencer {

	@Inject
	private MycnlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FpPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FpPackage.DESIGN_COMMERCIAL:
				sequence_DesignCommercial(context, (DesignCommercial) semanticObject); 
				return; 
			case FpPackage.DESIGN_EDUCATIONAL:
				sequence_DesignEducational(context, (DesignEducational) semanticObject); 
				return; 
			case FpPackage.DESIGN_RESIDENTIAL:
				sequence_DesignResidential(context, (DesignResidential) semanticObject); 
				return; 
			case FpPackage.DOMAIN_MODEL:
				sequence_DomainModel(context, (DomainModel) semanticObject); 
				return; 
			case FpPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case FpPackage.CALTREES_BUILD_ACTION:
				sequence_caltreesBuildAction(context, (caltreesBuildAction) semanticObject); 
				return; 
			case FpPackage.FINDTEMP_BUIL_ACTION:
				sequence_findtempBuilAction(context, (findtempBuilAction) semanticObject); 
				return; 
			case FpPackage.FINDTEMP_CREATE_LAKE:
				sequence_findtempCreateLake(context, (findtempCreateLake) semanticObject); 
				return; 
			case FpPackage.FINDTEMP_CUT_TREES:
				sequence_findtempCutTrees(context, (findtempCutTrees) semanticObject); 
				return; 
			case FpPackage.FINDTEMP_DEMOLISH:
				sequence_findtempDemolish(context, (findtempDemolish) semanticObject); 
				return; 
			case FpPackage.FINDTEMP_PLANT_BUSHES:
				sequence_findtempPlantBushes(context, (findtempPlantBushes) semanticObject); 
				return; 
			case FpPackage.FINDTEMP_PLANT_TREES:
				sequence_findtempPlantTrees(context, (findtempPlantTrees) semanticObject); 
				return; 
			case FpPackage.FINDTEMP_REMOVE_BUSHES:
				sequence_findtempRemoveBushes(context, (findtempRemoveBushes) semanticObject); 
				return; 
			case FpPackage.FINDTEMP_REMOVE_LAKE:
				sequence_findtempRemoveLake(context, (findtempRemoveLake) semanticObject); 
				return; 
			case FpPackage.SHOW_REGION:
				sequence_showRegion(context, (showRegion) semanticObject); 
				return; 
			}
		else if (epackage == TypesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if (rule == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_INNER_TYPE_REFERENCE:
				sequence_JvmParameterizedTypeReference(context, (JvmInnerTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_LOWER_BOUND:
				if (rule == grammarAccess.getJvmLowerBoundAndedRule()) {
					sequence_JvmLowerBoundAnded(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if (action == grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()) {
					sequence_JvmParameterizedTypeReference_JvmInnerTypeReference_1_4_0_0_0(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmTypeReferenceRule()
						|| action == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()
						|| rule == grammarAccess.getJvmParameterizedTypeReferenceRule()
						|| rule == grammarAccess.getJvmArgumentTypeReferenceRule()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
				return; 
			case TypesPackage.JVM_UPPER_BOUND:
				if (rule == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
				return; 
			}
		else if (epackage == XbasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
				return; 
			case XbasePackage.XBASIC_FOR_LOOP_EXPRESSION:
				sequence_XBasicForLoopExpression(context, (XBasicForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XBINARY_OPERATION:
				sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
				return; 
			case XbasePackage.XBLOCK_EXPRESSION:
				if (rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXBlockExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
				return; 
			case XbasePackage.XCASE_PART:
				sequence_XCasePart(context, (XCasePart) semanticObject); 
				return; 
			case XbasePackage.XCASTED_EXPRESSION:
				sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
				return; 
			case XbasePackage.XCATCH_CLAUSE:
				sequence_XCatchClause(context, (XCatchClause) semanticObject); 
				return; 
			case XbasePackage.XCLOSURE:
				if (rule == grammarAccess.getXExpressionRule()
						|| rule == grammarAccess.getXAssignmentRule()
						|| action == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOrExpressionRule()
						|| action == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAndExpressionRule()
						|| action == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXEqualityExpressionRule()
						|| action == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXRelationalExpressionRule()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0()
						|| action == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0()
						|| rule == grammarAccess.getXOtherOperatorExpressionRule()
						|| action == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXAdditiveExpressionRule()
						|| action == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXMultiplicativeExpressionRule()
						|| action == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()
						|| rule == grammarAccess.getXUnaryOperationRule()
						|| rule == grammarAccess.getXCastedExpressionRule()
						|| action == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0()
						|| rule == grammarAccess.getXPostfixOperationRule()
						|| action == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0()
						|| rule == grammarAccess.getXMemberFeatureCallRule()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0()
						|| action == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0()
						|| rule == grammarAccess.getXPrimaryExpressionRule()
						|| rule == grammarAccess.getXLiteralRule()
						|| rule == grammarAccess.getXClosureRule()
						|| rule == grammarAccess.getXParenthesizedExpressionRule()
						|| rule == grammarAccess.getXExpressionOrVarDeclarationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
				return; 
			case XbasePackage.XDO_WHILE_EXPRESSION:
				sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
				return; 
			case XbasePackage.XFEATURE_CALL:
				sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
				return; 
			case XbasePackage.XIF_EXPRESSION:
				sequence_XIfExpression(context, (XIfExpression) semanticObject); 
				return; 
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
				return; 
			case XbasePackage.XLIST_LITERAL:
				sequence_XListLiteral(context, (XListLiteral) semanticObject); 
				return; 
			case XbasePackage.XMEMBER_FEATURE_CALL:
				sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
				return; 
			case XbasePackage.XNULL_LITERAL:
				sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
				return; 
			case XbasePackage.XNUMBER_LITERAL:
				sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
				return; 
			case XbasePackage.XPOSTFIX_OPERATION:
				sequence_XPostfixOperation(context, (XPostfixOperation) semanticObject); 
				return; 
			case XbasePackage.XRETURN_EXPRESSION:
				sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
				return; 
			case XbasePackage.XSET_LITERAL:
				sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
				return; 
			case XbasePackage.XSTRING_LITERAL:
				sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
				return; 
			case XbasePackage.XSWITCH_EXPRESSION:
				sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
				return; 
			case XbasePackage.XSYNCHRONIZED_EXPRESSION:
				sequence_XSynchronizedExpression(context, (XSynchronizedExpression) semanticObject); 
				return; 
			case XbasePackage.XTHROW_EXPRESSION:
				sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
				return; 
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
				return; 
			case XbasePackage.XTYPE_LITERAL:
				sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
				return; 
			case XbasePackage.XUNARY_OPERATION:
				sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
				return; 
			case XbasePackage.XVARIABLE_DECLARATION:
				sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
				return; 
			case XbasePackage.XWHILE_EXPRESSION:
				sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
				return; 
			}
		else if (epackage == XtypePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_DECLARATION:
				sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_SECTION:
				sequence_XImportSection(context, (XImportSection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Query returns DesignCommercial
	 *     DesignCommercial returns DesignCommercial
	 *
	 * Constraint:
	 *     (
	 *         (no_of_people=INT region=INT) | 
	 *         (no_of_people=INT region=INT) | 
	 *         (no_of_people=INT region=INT) | 
	 *         (no_of_people=INT region=INT) | 
	 *         (no_of_people=INT region=INT)
	 *     )
	 */
	protected void sequence_DesignCommercial(ISerializationContext context, DesignCommercial semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns DesignEducational
	 *     DesignEducational returns DesignEducational
	 *
	 * Constraint:
	 *     (
	 *         (no_of_people=INT region=INT) | 
	 *         (no_of_people=INT region=INT) | 
	 *         (no_of_people=INT region=INT) | 
	 *         (no_of_people=INT region=INT) | 
	 *         (no_of_people=INT region=INT)
	 *     )
	 */
	protected void sequence_DesignEducational(ISerializationContext context, DesignEducational semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns DesignResidential
	 *     DesignResidential returns DesignResidential
	 *
	 * Constraint:
	 *     (
	 *         (no_of_people=INT region=INT) | 
	 *         (no_of_people=INT region=INT) | 
	 *         (no_of_people=INT region=INT) | 
	 *         (no_of_people=INT region=INT) | 
	 *         (no_of_people=INT region=INT)
	 *     )
	 */
	protected void sequence_DesignResidential(ISerializationContext context, DesignResidential semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainModel returns DomainModel
	 *
	 * Constraint:
	 *     elements+=Model+
	 */
	protected void sequence_DomainModel(ISerializationContext context, DomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     query+=Query
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns caltreesBuildAction
	 *     caltreesBuildAction returns caltreesBuildAction
	 *
	 * Constraint:
	 *     (
	 *         (no_of_buildings=INT length=INT breadth=INT height=INT region=INT) | 
	 *         (no_of_buildings=INT length=INT breadth=INT height=INT region=INT) | 
	 *         (no_of_buildings=INT length=INT breadth=INT height=INT region=INT) | 
	 *         (no_of_buildings=INT length=INT breadth=INT height=INT region=INT) | 
	 *         (no_of_buildings=INT length=INT breadth=INT height=INT region=INT)
	 *     )
	 */
	protected void sequence_caltreesBuildAction(ISerializationContext context, caltreesBuildAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns findtempBuilAction
	 *     findtempBuilAction returns findtempBuilAction
	 *
	 * Constraint:
	 *     (
	 *         (no_of_buildings=INT length=INT breadth=INT height=INT region=INT) | 
	 *         (no_of_buildings=INT length=INT breadth=INT height=INT region=INT) | 
	 *         (no_of_buildings=INT length=INT breadth=INT height=INT region=INT) | 
	 *         (no_of_buildings=INT length=INT breadth=INT height=INT region=INT) | 
	 *         (no_of_buildings=INT length=INT breadth=INT height=INT region=INT)
	 *     )
	 */
	protected void sequence_findtempBuilAction(ISerializationContext context, findtempBuilAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns findtempCreateLake
	 *     findtempCreateLake returns findtempCreateLake
	 *
	 * Constraint:
	 *     ((area=INT region=INT) | (area=INT region=INT) | (area=INT region=INT) | (area=INT region=INT) | (area=INT region=INT))
	 */
	protected void sequence_findtempCreateLake(ISerializationContext context, findtempCreateLake semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns findtempCutTrees
	 *     findtempCutTrees returns findtempCutTrees
	 *
	 * Constraint:
	 *     ((no_of_trees=INT region=INT) | (no_of_trees=INT region=INT) | (no_of_trees=INT region=INT) | (no_of_trees=INT region=INT) | (no_of_trees=INT region=INT))
	 */
	protected void sequence_findtempCutTrees(ISerializationContext context, findtempCutTrees semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns findtempDemolish
	 *     findtempDemolish returns findtempDemolish
	 *
	 * Constraint:
	 *     (
	 *         (no_of_buildings=INT (length=INT breadth=INT height=INT)? region=INT) | 
	 *         (no_of_buildings=INT (length=INT breadth=INT height=INT)? region=INT) | 
	 *         (no_of_buildings=INT (length=INT breadth=INT height=INT)? region=INT) | 
	 *         (no_of_buildings=INT (length=INT breadth=INT height=INT)? region=INT) | 
	 *         (no_of_buildings=INT (length=INT breadth=INT height=INT)? region=INT)
	 *     )
	 */
	protected void sequence_findtempDemolish(ISerializationContext context, findtempDemolish semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns findtempPlantBushes
	 *     findtempPlantBushes returns findtempPlantBushes
	 *
	 * Constraint:
	 *     ((area=INT region=INT) | (area=INT region=INT) | (area=INT region=INT) | (area=INT region=INT) | (area=INT region=INT))
	 */
	protected void sequence_findtempPlantBushes(ISerializationContext context, findtempPlantBushes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns findtempPlantTrees
	 *     findtempPlantTrees returns findtempPlantTrees
	 *
	 * Constraint:
	 *     ((no_of_trees=INT region=INT) | (no_of_trees=INT region=INT) | (no_of_trees=INT region=INT) | (no_of_trees=INT region=INT) | (no_of_trees=INT region=INT))
	 */
	protected void sequence_findtempPlantTrees(ISerializationContext context, findtempPlantTrees semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns findtempRemoveBushes
	 *     findtempRemoveBushes returns findtempRemoveBushes
	 *
	 * Constraint:
	 *     ((area=INT region=INT) | (area=INT region=INT) | (area=INT region=INT) | (area=INT region=INT) | (area=INT region=INT))
	 */
	protected void sequence_findtempRemoveBushes(ISerializationContext context, findtempRemoveBushes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns findtempRemoveLake
	 *     findtempRemoveLake returns findtempRemoveLake
	 *
	 * Constraint:
	 *     ((area=INT region=INT) | (area=INT region=INT) | (area=INT region=INT) | (area=INT region=INT) | (area=INT region=INT))
	 */
	protected void sequence_findtempRemoveLake(ISerializationContext context, findtempRemoveLake semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Query returns showRegion
	 *     showRegion returns showRegion
	 *
	 * Constraint:
	 *     (
	 *         region=INT | 
	 *         region=INT | 
	 *         region=INT | 
	 *         region=INT | 
	 *         region=INT | 
	 *         region=INT | 
	 *         region=INT
	 *     )
	 */
	protected void sequence_showRegion(ISerializationContext context, showRegion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
